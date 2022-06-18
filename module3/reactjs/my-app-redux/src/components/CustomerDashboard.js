import React from 'react';

function CustomerDashboard() {

    const myUser = localStorage.getItem("myUser");
    console.log(myUser);

    return (
        <div>
            {myUser !== null ?
                <div>
                    <h4>Welcome {JSON.parse(myUser).customerName}</h4>
                    <h2>Customer DashBoard</h2>       


                </div>
                : <h2>Please Login</h2>
            }

        </div>
    )

}

export default CustomerDashboard;