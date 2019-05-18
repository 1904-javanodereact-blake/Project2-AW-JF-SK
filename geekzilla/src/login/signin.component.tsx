import React from 'react';


interface ISignIn {
    username: string;
    password: string;
    errorMessage: string;
}

export class SignInComponent extends React.Component<any, ISignIn> {
    constructor(props:any) {
        super(props);
        this.state = {
            username: '',
            password: '',
            errorMessage: ''
        };
    }

    submit = async (event) => {
        event.preventDefault();
        console.log('login attempt');
        const credentials = {
            username: this.state.username,
            password: this.state.password
        };

        try {
            const resp = await fetch('http://localhost:8080/users/login', {
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
            } else if (resp.status === 200) {
                this.props.history.push('/login');
            } else {
                this.setState({
                    errorMessage: 'Cannot Login At This Time'
                });
            }
        } catch (err) {
            console.log(err);
        }
    }
    
    updateUsername = (event) => {
        this.setState({
            username: event.target.value
        });
    }

    updatePassword = (event) => {
        this.setState({
            password: event.target.value
        })
    }
    render() {
        const { username, password, errorMessage} = this.state;
        return(
            <form className="form-login" onSubmit={this.submit}>
            <h1 className="h3 mb-3 font-weight-normal"> Sign In </h1>
            <label htmlFor="inputUsername" className="sr-only">Username</label>
            <input type="text" id="inputUsername" name="username"
            className="form-control" placeholder="Username"
            required value={username} onChange={this.updateUsername} />

            <label htmlFor="inputPassword" className="sr-only">Password</label>
            <input type="password" id="inputPasswod" name="password"
            className="form-control" placeholder="Password"
            required value={password} onChange={this.updatePassword} />

            <button className="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            <p id="login-error">{errorMessage}</p>
            </form>
        );
    }
    
}