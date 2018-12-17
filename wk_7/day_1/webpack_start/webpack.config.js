const config = {
  entry: `${__dirname}/src/app.js`, //__dirname is short for current directory
  output: {
    path: `${__dirname}/public/js`,
    filename: 'bundle.js'//this is the name of the file it will create and put everything inspect
  },
  mode: 'development'
};

module.exports = config;
