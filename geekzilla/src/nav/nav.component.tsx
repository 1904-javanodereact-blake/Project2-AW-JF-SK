import React from 'react';
import { Link } from 'react-router-dom';


export class NavComponent extends React.Component {
    render() {
        return (
            <nav className="navbar navbar-toggleable-md navbar-expand-lg navbar-dark bg-light display-front nav-pad">
        <div className="navbar-header c-pointer shift-left">
        </div>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarsExample04">
          <ul className="navbar-nav ml-auto margin-nav">
            <li className="nav-item active">
              <Link to="/home" className="unset-anchor nav-link">Home</Link>
            </li>
            <li className="nav-item active">
              <Link to="/sign-in" className="unset-anchor nav-link">Sign In</Link>
            </li>
            <li className="nav-item active">
              <Link to="/registration" className="unset-anchor nav-link">Registration</Link>
            </li>
            <li className="nav-item active dropdown">
              <a className="nav-link dropdown-toggle pointer" id="examples-dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"></a>
              <div className="dropdown-menu" aria-labelledby="examples-dropdown">
                <div className="dropdown-item"><Link to="/claim" className="unset-anchor nav-link active">Profile Settings</Link></div>
                <div className="dropdown-item"><Link to="/current" className="unset-anchor nav-link active">CurrentClaims</Link></div>
                <div className="dropdown-item"><Link to="/useralt" className="unset-anchor nav-link active">Staff Handler</Link></div>
              </div>
            </li>
          </ul>
        </div>
      </nav>
        );
    }
}