import React from 'react';
import { Dropdown } from 'react-bootstrap';

import './Style.css';
import Question from '../img/question.png';

const QuestionIcon = () => {
    return (
        <Dropdown>
            <Dropdown.Toggle id="profile-dropdown" className="profile-icon-container">
                <img className={"icon"} src={Question} alt="Question Icon" />

            </Dropdown.Toggle>

            <Dropdown.Menu>
                <Dropdown.Item onClick={() => console.log('Button 1 clicked')}>Button 1</Dropdown.Item>
                <Dropdown.Item onClick={() => console.log('Button 2 clicked')}>Button 2</Dropdown.Item>
            </Dropdown.Menu>
        </Dropdown>
    );
};

export default QuestionIcon;
