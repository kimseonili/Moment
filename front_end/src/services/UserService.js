import axios from "axios";
import router from "../router";


const UNAUTHORIZED = 401
const onUnauthorized = () => {
    router.push('/login?rPath=${encodeURIComponent(location.pathname)}')
}

const apiServer = axios.create({
    baseURL: "http://localhost:9090"
})

export default {
    getUserById(id) {
        return apiServer.get('/api/user/' + id);
    },
    Login(email, password) {
        var body = {
            email : email,
            password : password
        }

        return apiServer.post('/api/login', body)
    },
    update(password, body){
        
        var temp = body;
        temp.password = password;
        return apiServer.put("/api/user", temp);
    },
    findid(user_name, phone){
        var body = {
            user_name : user_name,
            phone : phone
        }

        return apiServer.post("/api/user", body)
    },
    findpassword(email, phone){
        var body = {
            email : email,
            phone : phone
        }

        return apiServer.post("/api/user", body)
    }
}

export const auth = {
    getAllUsers(){
        return apiServer.get('/api/userAllAdmin')
    },
    Login(email, password) {
        return Request('post', '/api/login', {email, password})
    }
}
