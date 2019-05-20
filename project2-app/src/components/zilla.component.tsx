import React from 'react';
import { Zillas } from '../model/zillas';
import { ZillaCardComponent } from './zillacard.component';


interface IState {
    zilla: Zillas[];
}

export class ZillaComponent extends React.Component<any, IState> {

    constructor(props: any) {
        super(props);
        this.state = {
            zilla: []
        };
    }

    // in here we should initialize http calls
    async componentDidMount() {
        const resp = await fetch('http://localhost:8080/zillas', { method: 'GET', credentials: 'include' });
        const body = await resp.json();
        await this.setState({   
            zilla: body
        });
        console.log(this.state.zilla);
    }

    render() {
        console.log(this.state.zilla);
        return (
            <div className="container">
                <div className="center-cards">
                     {this.state.zilla.map(newZilla => (
                        <ZillaCardComponent key={'zilla-' + newZilla.postId} zillas={newZilla} />
                     ))}
                </div>
            </div>
        );
    }
}