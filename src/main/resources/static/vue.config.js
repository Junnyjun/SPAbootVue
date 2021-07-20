const path= required('path')

 module.exports = {
   outputDir= path.resolve(__dirname, "../src/main/resources/static")
   devServer: {
     proxy: {
        'api' : {
            target: "http://localhost:8080",
            ws: true,
            changeOrigin: true
        },
     }
   }
 };