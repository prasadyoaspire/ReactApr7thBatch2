import './App.css';

import {
  BrowserRouter as Router,
  Routes,
  Route,

} from 'react-router-dom';
import Counter from './components/Counter';
import FetchAllProducts from './components/FetchAllProducts';

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/counter" element={<Counter />} />
          <Route path="/product/all" element={<FetchAllProducts/>} />

        </Routes>
      </Router>
    </div>
  );
}

export default App;
