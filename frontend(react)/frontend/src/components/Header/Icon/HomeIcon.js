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

        </header>
    );
};

export default HomeIcon;
