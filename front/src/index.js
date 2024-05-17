import App from './App'
import reportWebVitals from './reportWebVitals';
import 'bootstrap/dist/css/bootstrap.min.css';
import { store } from './utils/Rdx';
import { Provider } from 'react-redux';
import * as root from "react-dom";
import { render } from 'react-dom';
import * as ReactDOM from 'react-dom';

ReactDOM.render(
    <React.StrictMode>
        <Provider store={store}>
            <App />
        </Provider>
    </React.StrictMode>,
    document.getElementById('root')
);