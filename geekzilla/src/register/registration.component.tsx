import React from 'react';

interface IRegistration {
    firstname: string,
    lastname: string,
    username: string,
    password: string,
    email: string
}

export class RegistrationComponent extends React.Component<any, IRegistration> {
    constructor(props) {
        super(props);
        this.state = {
         
            firstname: '',
            lastname: '',
            username: '',
            password: '',
            email: ''
        };
    }

    submit = async (event) => {
        event.preventDefault();
        const nuances = {
            firstname: this.state.firstname,
            lastname: this.state.lastname,
            username: this.state.username,
            password: this.state.password,
            email: this.state.email
        };

        try{
            const resp = await fetch('http://localhost:8081/users',{
                method: 'POST',
                credentials: 'include',
                body: JSON.stringify(nuances),
                headers: {
                'content-type': 'application/json' 
                }
            })
            console.log(resp);
        }catch (err) {
                console.log(err);
            
        }
    }

    updateFirstname = e => {
        this.setState({
            firstname: e.target.value
        });
    };

    updateLastname = e => {
        this.setState({
            lastname: e.target.value
        });
    };

    updateUsername = e => {
        this.setState({
            username: e.target.value
        });
    };

    updatePassword = e => {
        this.setState({
            password: e.target.value
        });
    };

    updateEmail = e => {
        this.setState({
            email: e.target.value
        });
    };

    render() {
        return (
            <form onSubmit={(e)=> this.submit(e)} className='update'>
                <input type='text' id='firstname' onChange={this.updateFirstname}
                name='firstname' placeholder='Enter Firstname'/>
                <br />
                <input type='text' id='lastname' onChange={this.updateLastname}
                name='lastname' placeholder='Enter Lastname'/>
                <br />
                <input type='text' id='username' onChange={this.updateUsername}
                name='username' placeholder='Enter Username'/>
                <br />
                <input type='text' id='password' onChange={this.updatePassword}
                name='password' placeholder='Enter Password'/>
                <br />
                <input type='text' id='email' onChange={this.updateEmail}
                name='email' placeholder='Enter Email'/>
                <br />
                <button className='btn btn-info' type='submit'>Submit</button>
            </form>
        );
    }
}