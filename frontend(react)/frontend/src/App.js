import './App.css';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import Header from "./components/Header";
import Contacts from "./pages/Contacts";


function App() {
    return (

        <div className="App" basename="/homepage">
            <Header/>
            <Router>
                <Routes>
                    <Route path="/*" element={<Navigate to="/homepage" />} />
                    <Route path="/register" element={<Contacts/>} />
                </Routes>
            </Router>
        </div>
    );
}

export default App;




