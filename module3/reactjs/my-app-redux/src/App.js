import './App.css';

import {
  BrowserRouter as Router,
  Routes,
  Route,

} from 'react-router-dom';
import Counter from './components/Counter';

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/counter" element={<Counter />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
