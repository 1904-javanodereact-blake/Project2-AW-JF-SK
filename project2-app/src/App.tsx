import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './App.css';
import { NavComponent } from './components/nav/nav.component';
import './include/bootstrap';
import { SignInComponent } from './components/sign-in/sign-in.component';
import { InvalidUserComponent } from './components/invaliduser.component';
import { UserComponent } from './components/UserProfiles/users.component';  
import { ZillaComponent } from './components/zilla.component';
import { UserIdComponent } from './components/UserProfiles/userbyusername.component';
import { RegistrationComponent } from './components/registration.component';
const App: React.FC = () => {
  return (
    <BrowserRouter>
      <NavComponent />
      <div id="main-content-container">
        <Switch>

        <Route path="/sign-in" component={SignInComponent} />
        <Route path="/users" component={UserComponent} />
        <Route path="/zillas" component={ZillaComponent} />
        <Route path="/usersbyid" component={UserIdComponent} />
        <Route path="/invaliduser" component={InvalidUserComponent} />
        <Route path="/register" component={RegistrationComponent} />
        </Switch>
      </div>
    </BrowserRouter>
  );
}

export default App;
