import React from "react";
import {useState} from "react";

import "./style.css"
import contactFetch from "../../fetchs/Contact";
import Index from "../../components/Header";

function Contact() {

    const initialFormValues = {fullname: "", password: "", email: ""};
    //State'ler kullanıcıdan alınacak bilgileri tutar.
    const [form, setForm] = useState(initialFormValues);

    const onChangeInput = (e) => {
        setForm({...form, [e.target.name]: e.target.value})
    }

    const onSubmit = async (e) => {
        e.preventDefault();
        if (form.fullname === "" || form.email === "" || form.password === "") {
            return false;
        }
        // Diğer kodlarınız...
        try {
            console.log("onsubmit")
            const data = await contactFetch(form);
            console.log(data);
        } catch (error) {
            console.error(error);
        }
    }
    //return bloğunda, formun ve giriş alanının JSX kodu bulunur.
    return (

        <Index>
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
                        name="password"
                        placeholder="password"
                        value={form.password}
                        onChange={onChangeInput}/>
                </div>
                <button className="register-button" type="submit"> Add</button>
            </form>
            <p>Zaten bir hesabınız var mı? Giriş yapmak için <a href={"/login"}> Buraya tıklayın.</a></p>
        </Index>

    )

}

export default Contact;