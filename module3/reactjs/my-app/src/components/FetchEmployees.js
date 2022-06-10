import React from 'react';
import DisplayEmployees from './DisplayEmployees';

function FetchEmployees() {

    const employeeList = [
        {
            empno: 101,
            name: "raj",
            salary: 50000
        },
        {
            empno: 102,
            name: "sam",
            salary: 60000
        },
        {
            empno: 103,
            name: "sachin",
            salary: 40000
        }, {
            empno: 104,
            name: "rohit",
            salary: 70000
        }
    ]

    return (
        <div>
           <DisplayEmployees empList = {employeeList}/>
        </div>
    );
}

export default FetchEmployees;