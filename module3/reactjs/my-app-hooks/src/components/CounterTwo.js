import React, { useState } from 'react';

function CounterTwo() {

    const [counter, setCounter] = useState(100);

    const [age, setAge] = useState(42);
    const [fruit, setFruit] = useState('banana');
    const [todos, setTodos] = useState([{ text: 'Learn Hooks' }]);

    const increment = function () {
        setCounter(counter + 1);
    }
    const decrement = function () {
        setCounter(counter - 1);
    }
    return (
        <div>
            <h1>Counter Demo using Functional Component with Hooks</h1>
            <h3>Counter : {counter}</h3>
            <button onClick={increment}>+</button>  <button onClick={decrement}>-</button>
        </div>
    )
}
export default CounterTwo;