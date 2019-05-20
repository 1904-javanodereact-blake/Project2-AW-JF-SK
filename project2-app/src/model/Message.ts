export class Message
{
    mesId: number;
    author: number;
    content: String;
    sent_on: String;

    constructor(mesId: number, author: number, content: String, sent_on: String)
    {
      this.mesId = mesId;
      this.author = author;
      this.content = content;
      this.sent_on = sent_on;

    }
  }
