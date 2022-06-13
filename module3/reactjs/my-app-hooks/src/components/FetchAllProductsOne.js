import React from 'react';
import Axios from 'axios';

class FetchAllProductsOne extends React.Component {
    constructor() {
        super();
        this.state = {
            products: []
        }
    }
    componentDidMount() {
        Axios.get("http://localhost:8081/product/all").then(resp => this.setState({
            products: resp.data
        }));
    }
    render() {


          return (
            <div>
                <h2>All Products</h2>
                {
                    this.state.products.length > 0 ?

                        <table border="1">
                            <tr>
                                <th>ProductId</th>
                                <th>Name</th>
                                <th>Price</th>
                                <th>Category</th>
                            </tr>
                            {
                                this.state.products.map((p, index) =>
                                    <tr key={index}>
                                        <td>{p.productId}</td>
                                        <td>{p.productName}</td>
                                        <td>{p.productPrice}</td>
                                        <td>{p.category}</td>
                                    </tr>
                                )
                            }
                        </table>
                        : <h3>No Products Available</h3>
                }
            </div>
        )
    }
}

export default FetchAllProductsOne;