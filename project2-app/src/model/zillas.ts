import { User } from "./user";

export class Zillas {
    postId: number;
    user: User;
    likeCount: number;
    post: String; 
    sentOn: String;

  
    constructor(postId = 0, user= new User, likeCount = 0, post: '', sentOn: '') {
      this.postId = postId;
      this.user = user;
      this.likeCount = likeCount;
      this.post = post;
      this.sentOn = sentOn;
    }
  }