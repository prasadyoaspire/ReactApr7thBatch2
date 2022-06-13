import './App.css';
import CounterOne from './components/CounterOne';
import CounterTwo from './components/CounterTwo';
import FetchAllProductsTwo from './components/FetchAllProductsTwo';

import {
  BrowserRouter as Router,
  Routes,
  Route,

} from 'react-router-dom';


import CreateProduct from './components/CreateProduct';
import Home from './components/Home';

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/counterone" element={<CounterOne />} />
          <Route path="/countertwo" element={<CounterTwo />} />
          <Route path="/product/all" element={<FetchAllProductsTwo />} />
          <Route path="/product/save" element={<CreateProduct/>} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
