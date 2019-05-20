import React from 'react';
import { UserCardComponent } from './usercard.component';
import { User } from '../../model/user';
import { Subscription } from 'rxjs';
import { user$ } from '../../streams/user-stream';

interface IState {
  users : any;
  user_id: number;
  user?: User,
  userSubscription?: Subscription
}

export class UserIdComponent extends React.Component<any, IState> {
    updateUserID: any;

  constructor(props: any) {
    super(props);
    this.state = {
    users: undefined,
    user_id: 0
    };
  }

  componentDidMount() {
    const userSub = user$.subscribe((user) => {
      this.setState({
        user: user
      })
    });

    this.setState({
      userSubscription: userSub
    });
  }

  componentWillUnmount() {
    this.state.userSubscription && this.state.userSubscription.unsubscribe();
  }

  // in here we should initialize http calls
   getId = async (id:number) => {
      
    const resp = await fetch('http://localhost:8080/users/' + id, { method: 'GET', credentials: 'include' });
    console.log('Not Allowed');   
    const body = await resp.json();
       
       this.setState({
         users: body
        
        })
  }
  
  updateUserId = (event) => {
      this.setState({
          user_id: event.target.value
      })

  }

  render() {
      const {user_id} = this.state;
      const myUser = this.state.users;
      const currUser = this.state.user;
    return (
      <div className="container">
        <div className="center-cards"> 
            {currUser && <UserCardComponent user ={currUser}/>}
        </div>
      </div>
    );
  }
}