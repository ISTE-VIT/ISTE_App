const express = require('express');
const router = express.Router();
const Resources = require('../models/Resources');
const dotenv = require('dotenv');
dotenv.config();

router.get('/', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const resources = await Resources.find();
            res.json(resources);
        } catch (err) {
            res.json({message: err})
        }
    }
    else
    {
        res.status(400).json({message: "Access Denied"});
    }
});

router.get('/find', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const resources = await Resources.find({title
                :req.query.title});
            res.json(resources);
        } catch (err) {
            res.json({message: err})
        }
    }
    else
    {
        res.status(400).json({message: "Access Denied"});
    }
});

router.get('/find/:title', async (req,res) => {
    if(req.headers['api_key'] === process.env.API_KEY)
    {
        try {
            const resources = await Resources.find({title
                :req.params.title});
            res.json(resources);
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