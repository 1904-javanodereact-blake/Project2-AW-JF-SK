import { images } from "./images";

export class User {
  user_id: number;
  userName: string;
  password: string;
  firstName: string;
  lastName: string;
  email: string;
  profilePicture: images;

  constructor(user_Id = 0, userName = '', password = '', 
  firstname = '', lastName = '', email = '', profilePicture = new images(0,'','')) {
    this.user_id = user_Id;
    this.userName = userName;
    this.password = password;
    this.firstName = firstname;
    this.lastName = lastName;
    this.email = email;
    this.profilePicture = profilePicture
  }
}