import React from 'react';

function Welcome(props) {

    return (
        <div>
            <h2>Welcome {props.fname} {props.lname}</h2>
        </div>
    )
}

export default Welcome;