import React from 'react';

function DisplayEmployees(props) {

    return (
        <div>

            <table border="1">
                <tr>
                    <th>EmpNo</th>
                    <th>Name</th>
                    <th>Salary</th>
                </tr>
                {
                    props.empList.map(emp =>
                        <tr>
                            <td>{emp.empno}</td>
                            <td>{emp.name}</td>
                            <td>{emp.salary} </td>
                        </tr>
                    )
                }
            </table>

        </div>
    )
}

export default DisplayEmployees;