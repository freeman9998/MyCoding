import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { store } from './utils';
import './utils/lang/i18n'
import { App } from './app';
// import * as serviceWorker from './serviceWorker';

ReactDOM.render(
  <Provider store={store}>
      <App />
  </Provider>,
  document.getElementById('root')
);

// serviceWorker.unregister();
