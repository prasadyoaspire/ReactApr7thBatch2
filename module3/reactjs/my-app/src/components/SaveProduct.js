import React from 'react';
import Axios from 'axios';

class SaveProduct extends React.Component {

    constructor() {
        super();
        this.state = {
            productName: "",
            productPrice: "",
            category: ""
        }
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({
            [event.target.name]: event.target.value
        })
    }

    handleSubmit() {
        const payload = {
            productName: this.state.productName,
            productPrice: this.state.productPrice,
            category: this.state.category
        }
        Axios.post("http://localhost:8081/product/save", payload).then(resp =>
            alert("Product saved with id:" + resp.data.productId));
    }

    render() {
        return (
            <div>
                <div>
                    <label>
                        ProductName:
                        <input type="text" name="productName" value={this.state.productName} onChange={this.handleChange} />
                    </label>
                </div>
                <div>
                    <label>
                        ProductPrice:
                        <input type="text" name="productPrice" value={this.state.productPrice} onChange={this.handleChange} />
                    </label>
                </div>
                <div>
                    <label>
                        Category:
                        <input type="text" name="category" value={this.state.category} onChange={this.handleChange} />
                    </label>
                </div>
                <button onClick={this.handleSubmit}>Submit</button>

            </div>
        )
    }
}

export default SaveProduct;