// HomeIcon.js

import  Chat  from '../img/chat.png'; // png dosyasının yolu
import ProfileIcon  from '../Icon/ProfileIcon';
import QuestionIcon from "./QuestionsIcon";
import Team from '../img/team.png';

import HomeIcon from '../Icon/HomeIcon'

const ChatIcon = () => {
    return (
            <a href="/chat">
                <img src={Chat} alt="Chat Icon" className="icon" />
            </a>
    );
};

function TeamIcon() {
    return (
        <a href="/team">
            <img src={Team} alt="Team Icon" className="icon" />
        </a>
    );
}

export { HomeIcon, ChatIcon, ProfileIcon, QuestionIcon, TeamIcon };