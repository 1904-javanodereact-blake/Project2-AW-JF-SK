import React from 'react';
import { Link } from 'react-router-dom';
import animeLogo from '../../assets/maxresdefault.jpg';



export class NavComponent extends React.Component {
  render() {
    return (
      <div id = "form">
      <nav className="navbar navbar-toggleable-md navbar-expand-lg navbar-light bg-light display-front nav-pad">
        <div className="navbar-header c-pointer shift-left">
          <Link to="/home" className="unset-anchor nav-link">
            <img className="img-adjust-position rev-logo" src={animeLogo} alt="anime" /></Link>
        </div>  
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarsExample04">
          <ul className="navbar-nav ml-auto margin-nav">  
          <li className="nav-item active">
              <Link to="/sign-in" className="unset-anchor nav-link">Sign In</Link>
              </li>
                 
              <li className="nav-item active">
            <Link to="/zillas" className="unset-anchor nav-link">NewsFeed</Link>
            <Link to="/register" className="unset-anchor nav-link">Register</Link>
            
          </li>
          <li className="nav-item active dropdown">
              <div className="nav-link dropdown-toggle pointer" id="Users-dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">User Profiles</div>
              <div className="dropdown-menu" aria-labelledby="examples-dropdown">
                <div className="dropdown-item"><Link to="/users" className="unset-anchor nav-link active">GetAllUsersProfiles</Link></div>
                <div className="dropdown-item"><Link to="/usersbyid" className="unset-anchor nav-link active">GetLoginUser</Link></div>
              </div>
            </li> 
          </ul>
        </div>
        
      </nav>
      </div>
    );
  }
}