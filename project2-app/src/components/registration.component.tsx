import React from 'react';

interface ISignInState {
    userName: string;
    password: string;
    firstName: string;
    lastName: string;
    email: string;
    errorMessage: string;
}

export class RegistrationComponent extends React.Component<any, ISignInState> {
    constructor(props) {
        super(props);
        this.state = {
            userName: '',
            password: '',
            firstName: '',
            lastName: '',
            email: '',
            errorMessage: ''
        };
    }

    submit = async (event) => {
        event.preventDefault();
        console.log('attempting to Register');
        const credentials = {
            userName: this.state.userName,
            password: this.state.password,
            firstName: this.state.firstName,
            lastName: this.state.lastName,
            email: this.state.email,
        };



        try {
            console.log(credentials);
            const resp = await fetch('http://localhost:8080/users', {
                method: 'POST',
                credentials: 'include',
                body: JSON.stringify(credentials),
                headers: {
                    'content-type': 'application/json'
                }
            })
            console.log(resp);

            if (resp.status === 401) {
                this.setState({
                    errorMessage: 'Invalid Credentials'
                });
            } else if (resp.status === 201) {
                // redirect to spaceships page
                // const user = await resp.json();
                this.props.history.push('/zillas');
            } else {
                this.setState({
                    errorMessage: 'Cannot Register At This Time'
                });
            }
        } catch (err) {
            console.log(err);
        }
    }

    updateUsername = (event) => {
        this.setState({
            userName: event.target.value
        });
    }

    updatePassword = (event) => {
        this.setState({
            password: event.target.value
        })
    }
    updatefirstName = (event) => {
        this.setState({
            firstName: event.target.value
        })
    }
    updatelastName = (event) => {
        this.setState({
            lastName: event.target.value
        })
    }
    updateemail = (event) => {
        this.setState({
            email: event.target.value
        })

    }
    render() {
        const { userName, password, firstName, lastName, email, errorMessage } = this.state;
        return (
            <div id="form">
            <form className="form-signin" onSubmit={this.submit}>
            <div className="form-group">
            <h1> Please fill out the fields</h1>
                <label>Username</label>
                <input type="username" className="form-control" id="exampleUsername" 
                aria-describedby="usernameHelp" placeholder="Enter username" 
                value={userName} onChange={this.updateUsername} ></input>
            </div>

            <div className="form-group">
                <label>Firstname</label>
                <input type="firstname" className="form-control" id="exampleFirstname" 
                aria-describedby="firstnameHelp" placeholder="Enter your Firstname"
                value={firstName} onChange={this.updatefirstName}></input>
            </div>
            <div className="form-group">
                <label>Lastname</label>
                <input type="lastname" className="form-control" id="exampleLastname" 
                aria-describedby="lastnameHelp" placeholder="Enter your Lastname"
                value={lastName} onChange={this.updatelastName}></input>
            </div>
            <div className="form-group">
                <label>Email address</label>
                <input type="email" className="form-control" id="exampleInputEmail" 
                aria-describedby="emailHelp" placeholder="Enter email"
                value={email} onChange={this.updateemail}></input>
            </div>
            <div className="form-group">
                <label>Password</label>
                <input type="password" className="form-control" id="exampleInputPassword1" placeholder="Password"
                value={password} onChange={this.updatePassword}></input>
            </div>
            <button type="submit" className="btn btn-primary">Submit</button>
        </form>
            </div>
        );
    }
}