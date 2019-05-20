import React from 'react';
import { UserCardComponent } from './usercard.component';
import { User } from '../../model/user';

interface IState {
    users: User[]
}

export class UserComponent extends React.Component<any, IState> {

    constructor(props: any) {
        super(props);
        this.state = {
            users: []
        };
    }

    // in here we should initialize http calls
    async componentDidMount() {
        const resp = await fetch('http://localhost:8080/users/', { method: 'GET', credentials: 'include' });
        const body = await resp.json();
        await this.setState({
            users: body
        });
        console.log(this.state.users);
    }

    render() {
        return (
            <div className="container">
                <div className="row">
                    {this.state.users.map(user => (
            <UserCardComponent key={user.user_id} user={user}/>
          ))}
                </div>
            </div>
        );
    }
}