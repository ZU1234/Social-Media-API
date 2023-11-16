// Header.js

import React from 'react';
import './Style.css';
import {HomeIcon, ChatIcon, ProfileIcon, QuestionIcon, TeamIcon} from "./Icon/index"; // Header stillerinin olduğu dosya

const Header = () => {

    return (
        <header className="header">

                <ul className="menu-bar">
                    <li>
                       <HomeIcon/>
                       <ChatIcon/>
                    </li>
                    <center >CODES HELP </center>
                    <li>
                        <TeamIcon/>
                        <QuestionIcon/>
                        <ProfileIcon/>
                    </li>
                </ul>

        </header>
    );
};

export default Header;
