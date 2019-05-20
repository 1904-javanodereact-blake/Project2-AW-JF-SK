import React from 'react';
import { Zillas } from '../model/zillas';

interface IZillaCardProps {
  zillas: Zillas
}

export class ZillaCardComponent extends React.PureComponent<IZillaCardProps> {
  render() {
    const Zillas = this.props.zillas;
    return (
      <div className="card col-md-4 col-sm-6 col-xs-12">
        <img src="https://wallpapercave.com/wp/iRsqcNG.jpg"
          className="card-img-top img-fluid"
          alt="..." />
        <div className="card-body">
          <h5 className="card-title">{Zillas.user.userName}</h5>
        </div>
        <ul className="list-group list-group-flush">
          <li className="list-group-item">Username: {Zillas.user.userName}</li>
          <li className="list-group-item">likeCount {Zillas.likeCount}</li>
          <li className="list-group-item">Post: {Zillas.post}</li>
          <li className="list-group-item">SentOn: {Zillas.sentOn}</li>
          <li className="list-group-item">
          </li>
        </ul>
      </div>
    )
  }
}