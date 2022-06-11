import React from 'react';

class DemoClass extends React.Component {

    constructor() {
        super();
        console.log("constructor called");
        this.state = {
            counter:0
        }
    }

    componentDidMount() {
        console.log("componentdidmount called");
    }

    increment = () => {
       this.setState({
        counter : this.state.counter+1
       })
    }

    render() {
        console.log("render called");
        return(
            <div>
                <h2>Counter: {this.state.counter} </h2>
                <button onClick={this.increment}>Increment</button>
            </div>
        )
    }
}

export default DemoClass;