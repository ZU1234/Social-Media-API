import React from "react";
import {useState} from "react";

import "./style.css"
function Contact() {

    const initialFormValues = {fullname: "", password: "", email: ""};
    //State'ler kullanıcıdan alınacak bilgileri tutar.
    const [form, setForm] = useState(initialFormValues);

    const onChangeInput = (e) => {
        setForm({...form, [e.target.name]: e.target.value})
    }

    const onSubmit = (e) => {
        /* Formun sayfayı yeniden yüklenmesini engeller
    // Böylece sayfanın yeniden yüklenmesi engellendiğinden,
    // kullanıcının girdiği bilgilerin formda kalması sağlanır.*/
        e.preventDefault();
        if (form.fullname === "" || form.email === "" || form.password === "") {

            return false;
        }
    }
    //return bloğunda, formun ve giriş alanının JSX kodu bulunur.
    return (
        <div>
            <form onSubmit={onSubmit}>
                <div className="inputs-div">
                    <input
                        name="fullname"
                        placeholder="Fullname"
                        value={form.fullname}
                        onChange={onChangeInput}/>
                    <input
                        name="email"
                        placeholder="Email"
                        value={form.email}
                        onChange={onChangeInput}/>
                    <input
                        name="phone_number"
                        placeholder="Phone Number"
                        value={form.password}
                        onChange={onChangeInput}/>
                </div>
                <button className="register-button" type="submit"> Add</button>
            </form>
            <p>Zaten bir hesabınız var mı? Giriş yapmak için <a href={"/login"}> Buraya tıklayın.</a></p>
        </div>

    )

}

export default Contact;