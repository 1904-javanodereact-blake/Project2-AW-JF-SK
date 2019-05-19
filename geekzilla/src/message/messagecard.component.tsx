import React from 'react';

interface IMessageCardProps {
    message: Message;
}

export class Message extends React.PureComponent<IMessageCardProps> {
    render() {
        const message = this.props.message;
        return (
            <div className="card col-md-4 col-sm-6 col-xs-12">
            <img src="" className="card-img-top img-fluid"
            alt="..." />
            <div className="card-body">
              <h5 className="card-title">{}</h5>
            </div>
            <ul className="list-group list-group-flush">
            </ul>
            </div>
        )
    }
}