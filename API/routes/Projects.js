const express = require('express');
const router = express.Router();
const Projects = require('../models/Projects');
const dotenv = require('dotenv');
dotenv.config();

router.get('/', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const projects = await Projects.find();
            res.json(projects);
        } catch (err) {
            res.json({message: err})
        }
    }
    else
    {
        res.status(400).json({message: "Access Denied"});
    }
});

module.exports = router;