import React from 'react';
import { string, number } from 'prop-types';

export class MessageComponent extends React.Component<any, any> {
    constructor(props: any) {
        super(props);
        this.state = {
            message: {messageid: 0, message: '', isRead: false}
        };
    }

    newMessage = async (userid) => {
        const resp = await fetch('http://localhost:8081/messages/' + this.state.message.messageid, {
            credentials: 'include'
        });
        const body = await resp.json();
        console.log(body);
        let messgae1 = body;
        let message2 = {
            messageid: number,
            message: string,
            isRead: false 
        };
        message2.messageid = messgae1.messageid;
        message2.message = messgae1.message;
        message2.isRead = message2.isRead;
        console.log(message2)
        this.setState({
            message: message2
        })
    }

        render() {
            return(
                <div className="container">
                <img src="" className="card-img-top"
                alt="..." />
                <div className="row">
                <div className="card col-md-4 col-sm-6 col-xs-12">
                <button onClick={() => this.newMessage(this.state.message.messageid)}
                className="btn btn-primary">Retrieve</button>

                <div className="card-body">
                    <h4 className="card-title">{this.state.message.messageid}</h4>
                </div>
                </div>
                </div>
                </div>
            );
        
    }
}