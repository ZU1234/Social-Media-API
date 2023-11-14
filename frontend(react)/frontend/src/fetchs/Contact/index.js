
export async function contact(formData) {
    try {
        const response = await fetch('http://localhost:8095/user', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        });
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }

        const data = await response.json();
        return data;
    } catch (error) {
        throw new Error('There has been a problem with your fetch operation: ' + error);
    }
}
export default contact;
