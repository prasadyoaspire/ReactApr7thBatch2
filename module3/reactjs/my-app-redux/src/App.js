import './App.css';
import React,{useState} from 'react';
import {
  BrowserRouter as Router,
  Routes,
  Route,

} from 'react-router-dom';
import Counter from './components/Counter';
import FetchAllProducts from './components/FetchAllProducts';
import NavBar from './components/NavBar';
import FetchProduct from './components/FetchProduct';
import CreateProduct from './components/CreateProduct';
import EditProduct from './components/EditProduct';
import Login from './components/Login';
import CustomerDashboard from './components/CustomerDashboard';
import Logout from './components/Logout';
import Home from './components/Home';

function App() {

  const [loggedIn, setLoggedIn] = useState(false);
 
  const myUser = localStorage.getItem("myUser");

  const updateNavBar = () => {
    setLoggedIn(true)
  }

  return (
    <div className="App">
      <Router>
        {/* <NavBar updateNavBar={updateNavBar} /> */}
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/counter" element={<Counter />} />
          <Route path="/product/all" element={<FetchAllProducts />} />
          <Route path="/product/get/:id" element={<FetchProduct />} />
          <Route path="/product/edit/:id" element={<EditProduct />} />
          {/* <Route path="/product/delete/:id" element={<FetchProduct/>} /> */}
          <Route path="/product/save" element={<CreateProduct />} />

          <Route path="/customer/login" element={<Login />} />
          <Route path="/customer/logout" element={<Logout />} />
          <Route path="/customer/dashboard" element={<CustomerDashboard />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
