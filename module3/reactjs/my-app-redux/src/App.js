import './App.css';

import {
  BrowserRouter as Router,
  Routes,
  Route,

} from 'react-router-dom';
import Counter from './components/Counter';
import FetchAllProducts from './components/FetchAllProducts';
import NavBar from './components/NavBar';
import FetchProduct from './components/FetchProduct';

function App() {
  return (
    <div className="App">
      <Router>
        <NavBar/>
        <Routes>
          <Route path="/counter" element={<Counter />} />
          <Route path="/product/all" element={<FetchAllProducts/>} />
          <Route path="/product/get/:id" element={<FetchProduct/>} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
