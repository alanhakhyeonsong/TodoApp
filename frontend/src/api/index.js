import axios from 'axios';

const config = {
    baseUrl : 'http://localhost:8080/'
}

// 전체 조회
function getTodos() {
    return axios.get(`${config.baseUrl}/todo`);
}

/**function postTodo() {
    return axios.post(`${config.baseUrl}/todo`);
}

function putTodo() {
    return axios.put(`${config.baseUrl}/todo`);
}

function deleteTodo() {
    return axios.delete(`${config.baseUrl}/todo`);
}**/

export {
    getTodos,
    // postTodo,
    // putTodo,
    // deleteTodo,
}