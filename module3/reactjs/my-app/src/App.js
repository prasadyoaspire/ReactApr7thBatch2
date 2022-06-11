import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';
import Home from './components/Home';

import Welcome from './components/Welcome';
import FetchEmployees from './components/FetchEmployees';
import Counter from './components/Counter';
import DemoClass from './components/DemoClass';
import FetchAllProducts from './components/FetchAllProducts';
import LoggedInUser from './components/LoggedInUser';
import Register from './components/Register';
import SaveProduct from './components/SaveProduct';

function App() {

  const firstName = "Raj";
  const lastName = "Kumar"

  return (
    <div className="App">
      {/* <Header /> */}
      {/* <Home /> */}
      {/* <FetchEmployees/> */}
      {/* <Welcome fname={firstName} lname={lastName} /> */}
      {/* <Footer /> */}
      {/* <Counter/> */}
      {/* <DemoClass/> */} 
      <FetchAllProducts/>
      {/* <LoggedInUser isLoggedIn= {false}/> */}
      {/* <Register/> */}
      <SaveProduct/>
    </div>
  );
}

export default App;
