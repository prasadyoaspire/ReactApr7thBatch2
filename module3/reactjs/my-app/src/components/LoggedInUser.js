import React from 'react';
import GuestUser from './GuestUser';
import RegisteredUser from './RegisteredUser';

function LoggedInUser(props) {

    const isLoggedIn = props.isLoggedIn;

    if (isLoggedIn) {
        return (
            <RegisteredUser />
        )
    }
    else {
        return (
            <GuestUser />
        )
    }
}

export default LoggedInUser;