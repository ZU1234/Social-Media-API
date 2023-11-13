// Header.js

import React from 'react';
import './Style.css';
import {HomeIcon, ChatIcon, ProfileIcon, QuestionIcon, TeamIcon} from "./Icon/index"; // Header stillerinin olduğu dosya

const Header = () => {
    return (
        <header className="header">
            <nav>
                <ul>
                    <li>
                       <HomeIcon/>
                       <ChatIcon/>
                    </li>
                    <h1 >CODES HELP </h1>
                    <li>
                        <TeamIcon/>
                        <QuestionIcon/>
                        <ProfileIcon/>
                    </li>
                </ul>
            </nav>
        </header>
    );
};

export default Header;
.