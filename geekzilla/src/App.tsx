import React from 'react';
import './include/bootstrap';
import './App.css';
import { BrowserRouter, Route } from 'react-router-dom';
import { SignInComponent } from './login/signin.component';
import {RegistrationComponent} from './register/registration.component'
import { NavComponent } from './nav/nav.component';
import { LandingPageComponent } from './landing/landingpage.component';

const App: React.FC = () => {
  return (
   <BrowserRouter>
   <div className="App">
   <NavComponent/>
         <Route path="/signin" component={SignInComponent} />
         <Route path="/register" component={RegistrationComponent} />
         <Route path="/home" component={LandingPageComponent}/>

     </div>
   </BrowserRouter>
  );
}

export default App;
