import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';
import Home from './components/Home';

import Welcome from './components/Welcome';
import FetchEmployees from './components/FetchEmployees';

function App() {

  const firstName = "Raj";
  const lastName = "Kumar"

  return (
    <div className="App">
      <Header />
      {/* <Home /> */}
      <FetchEmployees/>
      <Welcome fname={firstName} lname={lastName} />
      <Footer />
    </div>
  );
}

export default App;
