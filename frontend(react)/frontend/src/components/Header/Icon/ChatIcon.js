import React, { useState } from 'react';
import {Dropdown} from "react-bootstrap"; // SVG dosyasının yolu
import  Chat  from '../img/chat.png';
import './Style.css';
import ProfileIconImage from "../img/profile.png";
const ChatIcon = () => {

    return (



    <Dropdown>
        <Dropdown.Toggle id="profile-dropdown" className="profile-icon-container">
            <img src={Chat} alt="Chat Icon" className="icon" />
        </Dropdown.Toggle>

        <Dropdown.Menu>
            <Dropdown.Item onClick={() => console.log('Button 1 clicked')}>Button 1</Dropdown.Item>
            <Dropdown.Item onClick={() => console.log('Button 2 clicked')}>Button 2</Dropdown.Item>
        </Dropdown.Menu>
    </Dropdown>
    );
};

export default ChatIcon;
