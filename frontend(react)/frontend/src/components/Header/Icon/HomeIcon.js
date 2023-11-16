import React, { useState } from 'react';
import { ReactComponent as Home } from '../img/home-icon-silhouette.svg';
import {Dropdown} from "react-bootstrap"; // SVG dosyasının yolu

const HomeIcon = () => {
    const [isMenuOpen, setMenuOpen] = useState(false);

    const toggleMenu = () => {
        setMenuOpen(!isMenuOpen);
    };

    return (
        <header>
            <Dropdown>
                <Dropdown.Toggle id="profile-dropdown" className="profile-icon-container">
                    <Home className="icon" />
                </Dropdown.Toggle>
            </Dropdown>

            {/*<nav className={`menu ${isMenuOpen ? 'open' : ''}`}>*/}
            {/*    <ul>*/}
            {/*        <li>Home</li>*/}
            {/*        <li>About</li>*/}
            {/*        <li>Contact</li>*/}
            {/*    </ul>*/}
            {/*</nav>*/}

            {/*<button className="menu-toggle" onClick={toggleMenu}>*/}
            {/*    Menu*/}
            {/*</button>*/}
        </header>
    );
};

export default HomeIcon;
