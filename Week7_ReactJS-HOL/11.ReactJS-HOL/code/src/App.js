import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  }

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  }

  sayHello = () => {
    alert("Hello! This is a static message.");
  }

  sayWelcome = (msg) => {
    alert("Message: " + msg);
  }

  handleClick = (e) => {
    alert("I was clicked");
    console.log("Synthetic Event Object:", e);
  }

  render() {
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h1>subi</h1>

        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        <hr />

        <button onClick={() => this.sayWelcome("Welcome to React Events!")}>
          Say Welcome
        </button>

        <hr />

        <button onClick={this.handleClick}>
          Synthetic Event OnPress
        </button>

        <hr />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
