const express = require('express');
const app = express();
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');
const dotenv = require('dotenv');
dotenv.config();

app.use(cors());
app.use(bodyParser.json());

const HomeRoute = require('./routes/Home');
const EventsRoute = require('./routes/Events');
const BlogsRoute = require('./routes/Blogs');
const GalleryRoute = require('./routes/Gallery');
const FlagshipRoute = require('./routes/FlagshipEvents');
const ProjectsRoute = require('./routes/Projects');
const ResourcesRoute = require('./routes/Resources');

app.use('/home', HomeRoute);
app.use('/events',EventsRoute);
app.use('/blogs',BlogsRoute);
app.use('/gallery',GalleryRoute);
app.use('/flagship',FlagshipRoute);
app.use('/projects',ProjectsRoute);
app.use('/resources',ResourcesRoute);

app.get('/', (req, res) => {
  res.send('API is up and running. Jo krna hei kroo');
})

mongoose.connect(process.env.MONGO_URI ,() => console.log('Connected!!')
);

app.listen(process.env.PORT,()=>console.log("run server " + process.env.PORT));