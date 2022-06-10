import React from 'react';

function Home() {

    const employee = {
        empno : 101,
        name: "Rajkumar",
        salary : 50000
    }

    return(
        <div>
            <h3>Employee Details</h3>
            <p><strong>EmpNo: {employee.empno}</strong></p>
            <p><em>Name : {employee.name}</em></p>
            <p>Salary: {employee.salary}</p>
        </div>
    )
}

export default Home;