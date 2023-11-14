// HomeIcon.js

import React from 'react';
import { ReactComponent as Home } from './home-icon-silhouette.svg'; // SVG dosyasının yolu
import  Chat  from './chat.png'; // png dosyasının yolu
import Profile from './profile.png';
import Question from './question.png';
import Team from './team.png';

import "./Style.css";




const HomeIcon = () => {
    return (
            <a href="/">
                <Home className="home-icon" />
            </a>
    );
};
const ChatIcon = () => {
    return (
            <a href="/chat">
                <img src={Chat} alt="Chat Icon" className="chat-icon" />
            </a>
    );
};

const ProfileIcon = () => {
    return (
        <a href="/profile">
            <img src={Profile} alt="Profile Icon" className="profile-icon" />
        </a>
    );
}
function QuestionIcon() {
    return (
        <a href="/question">
            <img src={Question} alt="Question Icon" className="question-icon" />
        </a>
    );
}
function TeamIcon() {
    return (
        <a href="/team">
            <img src={Team} alt="Team Icon" className="team-icon" />
        </a>
    );
}

export { HomeIcon, ChatIcon, ProfileIcon, QuestionIcon, TeamIcon };