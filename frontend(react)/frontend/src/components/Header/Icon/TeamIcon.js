import {Dropdown} from "react-bootstrap"; // SVG dosyasının yolu
import './Style.css';
import Team from '../img/friendsIcon.png';
const  TeamIcon = () => {

    return (

        <Dropdown>
            <Dropdown.Toggle id="profile-dropdown" className="profile-icon-container">
                <img src={Team} alt="Team Icon" className="icon" />
            </Dropdown.Toggle>

            <Dropdown.Menu>
                <Dropdown.Item onClick={() => console.log('Button 1 clicked')}>Button 1</Dropdown.Item>
                <Dropdown.Item onClick={() => console.log('Button 2 clicked')}>Button 2</Dropdown.Item>
            </Dropdown.Menu>
        </Dropdown>
    );
};

export default  TeamIcon;




